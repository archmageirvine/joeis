package irvine.oeis.a392;

import irvine.oeis.FilterSequence;
import irvine.oeis.a386.A386762;

/**
 * A392423 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A392423 extends FilterSequence {

  /** Construct the sequence. */
  public A392423() {
    super(1, new A386762(), ODD);
  }
}

