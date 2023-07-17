package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000250 Number of symmetric reflexive relations on n nodes: (1/2)*A000666.
 * @author Sean A. Irvine
 */
public class A000250 extends A000666 {

  /** Construct the sequence. */
  public A000250() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
