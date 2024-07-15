package irvine.oeis.a071;

import irvine.oeis.FilterSequence;
import irvine.oeis.a154.A154831;

/**
 * A068017.
 * @author Sean A. Irvine
 */
public class A071351 extends FilterSequence {

  /** Construct the sequence. */
  public A071351() {
    super(new A154831(), k -> k.pow(4).add(2).isProbablePrime());
  }
}
