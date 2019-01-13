package irvine.oeis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A sequence comprising the Euler transform of another sequence.
 * @author Sean A. Irvine
 */
public class PartitionTransformSequence implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Sequence mSeq = null;
  protected final ArrayList<Z> mTerms = new ArrayList<>();
  private int mN = 0;

  /**
   * Creates a new partition transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public PartitionTransformSequence(final Sequence seq, final int skip) {
    mSeq = seq;
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
  }

  /**
   * Creates a new partition transform.
   */
  protected PartitionTransformSequence() {
  }

  /**
   * Set the underlying sequence.
   * @param seq sequence
   */
  public void setUnderlyingSequence(final Sequence seq) {
    mSeq = seq;
  }

  @Override
  public Z next() {
    ++mN;
    final Z next = mSeq.next();
    if (next != null) {
      mTerms.add(next);
    }
    Polynomial<Z> den = RING.one();
    for (final Z term : mTerms) {
      den = RING.multiply(den, RING.oneMinusXToTheN(term.intValueExact()), mN);
    }
    return RING.coeff(RING.one(), den, mN);
  }

  /**
   * Apply the partition transform to the sequence supplied on standard input.
   * @param args number of terms to skip
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final int skip = args.length > 0 ? Integer.parseInt(args[0]) : 0;
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      final PartitionTransformSequence seq = new PartitionTransformSequence(new ReaderSequence(r), skip);
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
