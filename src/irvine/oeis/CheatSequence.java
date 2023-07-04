package irvine.oeis;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.util.io.IOUtils;

/**
 * Produce a sequence by cheating: reading the terms directly out of a file.
 * Ideally this should not be used, but for a few important sequences where there is
 * no easy (or competitive) implementation this is used.
 * @author Sean A. Irvine
 */
public abstract class CheatSequence extends Sequence0 {

  private final List<Z> mSeq;
  private int mN = 0;

  protected abstract String getName();

  /** Construct the sequence. */
  public CheatSequence() {
    try {
      try (final BufferedReader r = IOUtils.reader("cheat/" + getName().replace('A', 'b') + ".txt.gz")) {
        mSeq = ZUtils.read(r, 1);
      }
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Z next() {
    if (mN < mSeq.size()) {
      return mSeq.get(mN++);
    }
    throw new UnsupportedOperationException();
  }
}

