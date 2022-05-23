package irvine.oeis.a054;

import irvine.oeis.InverseSequence;
import irvine.oeis.a002.A002211;

/**
 * A054781 First position of n in continued fraction for Khinchin's constant.
 * @author Sean A. Irvine
 */
public class A054781 extends InverseSequence {

  /** Construct the sequence. */
  public A054781() {
    super(new A002211());
  }
}
