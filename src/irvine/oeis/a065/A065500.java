package irvine.oeis.a065;

import irvine.oeis.PrependSequence;
import irvine.oeis.a060.A060401;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A065500 Number of distinct functions from a set with n^n elements to itself that can be defined naturally (in n) by typed lambda-calculus expressions.
 * @author Sean A. Irvine
 */
public class A065500 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A065500() {
    super(0, new PrependSequence(new A060401(), 2), k -> k.subtract(1));
  }
}
