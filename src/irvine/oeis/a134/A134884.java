package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134884 A three person Markov game designed to have a limiting ratio near <code>1/Alpha</code>: Ma <code>matrix=Mb = {{0, 1}, {-67, -67}}</code>; game value <code>=-67; Mc={{0, 1, 0}, {0, 0, 1}, {134, 0, 137}}</code>: game <code>value=134</code>; Total matrix game <code>value=-601526</code>; Characteristic Polynomial: <code>601526 + 1203052 x + 1234475 x^2 + 1243453 x^3 + 624507 x^4 + 13735 x^5 + 3 x^6-x^7</code>.
 * @author Sean A. Irvine
 */
public class A134884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134884() {
    super(new long[] {8978, 8978, 9313, 9112, 70}, new long[] {3, 1, 27269, 1954390, 385327519});
  }
}
