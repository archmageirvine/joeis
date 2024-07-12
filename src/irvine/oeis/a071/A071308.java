package irvine.oeis.a071;

import irvine.oeis.Combiner;
import irvine.oeis.a003.A003053;

/**
 * A071308 a(n) = (1/2) * (number of n X n 0..9 matrices with MM' mod 10 = I).
 * @author Sean A. Irvine
 */
public class A071308 extends Combiner {

  /** Construct the sequence. */
  public A071308() {
    super(1, new A071304(), new A003053(), MULTIPLY);
  }
}
