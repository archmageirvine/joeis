package irvine.oeis.a381;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.util.List;

import irvine.math.group.BinaryRowReductionCensus;
import irvine.math.group.LinearGroupOrder;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A381854 Number of nonsingular binary matrices by dimension and row-addition distance from the identity.
 * @author Gregory Morse
 */
public class A381854 extends Sequence0 {

  // For the large rows, set joeis.a381854.scratch to a directory on a disk
  // with enough space, and enable compact, deferred, buffered census runs.
  private final String mScratch = System.getProperty("joeis.a381854.scratch");
  private final long mDiskMiB = Long.getLong("joeis.a381854.diskMiB", 131072);
  private final long mSeconds = Long.getLong("joeis.a381854.seconds", 64800);
  private final int mWorkers = Integer.getInteger("joeis.a381854.workers", 1);
  private int mN = 0;
  private int mDepth = 0;
  private long mCount = 0;
  private long mOrder = 1;
  private BinaryRowReductionCensus.Row mRow;
  private List<Long> mSaved = List.of();

  private long sphere() {
    if (mDepth == 0) {
      return 1;
    }
    if (mScratch != null && mN >= 7) {
      try {
        if (mDepth >= mSaved.size()) {
          mSaved = BinaryRowReductionCensus.externalRow(mN, mDepth, Path.of(mScratch), mDiskMiB, mSeconds, mWorkers);
        }
        return mSaved.get(mDepth);
      } catch (final IOException e) {
        throw new UncheckedIOException(e);
      } catch (final InterruptedException e) {
        Thread.currentThread().interrupt();
        throw new IllegalStateException("Row reduction census interrupted", e);
      }
    }
    if (mRow == null) {
      mRow = new BinaryRowReductionCensus.Row(mN, 12000000);
      mRow.next(); // Identity already emitted.
    }
    final Long value = mRow.next();
    if (value == null) {
      throw new IllegalStateException("Row reduction layers have not covered the linear group");
    }
    return value;
  }

  @Override
  public Z next() {
    if (mN > 8) {
      throw new UnsupportedOperationException("Binary row reduction census supports at most eight rows");
    }
    final long value = sphere();
    mCount = Math.addExact(mCount, value);
    if (mCount == mOrder) {
      mOrder = ++mN <= 8 ? LinearGroupOrder.general(mN, Z.TWO).longValueExact() : 0;
      mCount = 0;
      mDepth = 0;
      mRow = null;
      mSaved = List.of();
    } else {
      ++mDepth;
    }
    return Z.valueOf(value);
  }
}
