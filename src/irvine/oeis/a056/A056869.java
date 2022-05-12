package irvine.oeis.a056;

import irvine.oeis.SkipSequence;
import irvine.oeis.a086.A086383;

/**
 * A056869 Prime hypotenuses of Pythagorean triangles with consecutive integer sides.
 * @author Sean A. Irvine
 */
public class A056869 extends SkipSequence {

  /** Construct the sequence. */
  public A056869() {
    super(new A086383(), 1);
  }
}

