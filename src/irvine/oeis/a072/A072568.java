package irvine.oeis.a072;

import irvine.oeis.FilterSequence;
import irvine.oeis.a024.A024675;

/**
 * A072568 Even interprimes.
 * @author Sean A. Irvine
 */
public class A072568 extends FilterSequence {

  /** Construct the sequence. */
  public A072568() {
    super(1, new A024675(), EVEN);
  }
}
