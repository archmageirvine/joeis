package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A023896 Sum of positive integers in smallest positive reduced residue system modulo n. a(1) = 1 by convention.
 * @author Sean A. Irvine
 */
public class A023896 extends AbstractSequence {

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
}

