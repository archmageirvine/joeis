package irvine.oeis.a026;

import irvine.oeis.PrependSequence;
import irvine.oeis.a185.A185325;

/**
 * A026798 Number of partitions of n in which the least part is 5.
 * @author Sean A. Irvine
 */
public class A026798 extends PrependSequence {

  /** Construct the sequence. */
  public A026798() {
    super(new A185325(), 1, 0, 0, 0, 0);
  }
}
