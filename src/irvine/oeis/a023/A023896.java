package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A023896 Sum of positive integers in smallest positive reduced residue system modulo n. a(1) = 1 by convention.
 * @author Sean A. Irvine
 */
public class A023896 extends AbstractSequence implements DirectSequence {

  private final A023022 mSeq1 = new A023022();

  /** Construct the sequence. */
  public A023896() {
    super(1);
  }

  private long mN = 0;

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return ++mN <= 2 ? Z.ONE : mSeq1.next().multiply(mN);
  }

  @Override
  public Z a(final Z n) {
    return n.compareTo(Z.TWO) <= 0 ? Z.ONE : mSeq1.a(n).multiply(n);
  }

  @Override
  public Z a(final long n) {
    return n <= 2 ? Z.ONE : mSeq1.a(n).multiply(n);
  }

}

