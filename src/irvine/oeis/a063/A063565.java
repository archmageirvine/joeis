package irvine.oeis.a063;

import irvine.oeis.PrependSequence;
import irvine.oeis.a030.A030000;

/**
 * A063565 Smallest positive number k such that 2^k contains n.
 * @author Sean A. Irvine
 */
public class A063565 extends PrependSequence {

  /** Construct the sequence. */
  public A063565() {
    super(new A030000().skip(2), 10, 4);
  }
}
