package irvine.oeis.a075;

import irvine.oeis.AlternatingSequence;
import irvine.oeis.a005.A005843;
import irvine.oeis.a014.A014076;

/**
 * A075066 Alternately odd and even composite numbers complementing the parity of the index.
 * @author Sean A. Irvine
 */
public class A075066 extends AlternatingSequence {

  /** Construct the sequence. */
  public A075066() {
    super(1, new A014076().skip(), new A005843().skip(2));
  }
}

