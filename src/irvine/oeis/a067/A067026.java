package irvine.oeis.a067;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002110;

/**
 * A067026 (Prime(n)# - 4)/2 is prime, where x# is the primorial A034386(x).
 * @author Sean A. Irvine
 */
public class A067026 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A067026() {
    super(1, 0, new A002110(), k -> k.divide2().subtract(2).isProbablePrime());
  }
}
