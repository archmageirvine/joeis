package irvine.oeis.a350;

import irvine.math.z.Z;

/**
 * A350792 Number of digraphs on n labeled nodes with a global source (or sink).
 * @author Gregory Morse
 */
public class A350792 extends A350793 {

  private int mN = 0;

  /** Construct the sequence. */
  public A350792() {
    super(false);
  }

  @Override
  public Z next() {
    return row(++mN).coeff(0);
  }
}
