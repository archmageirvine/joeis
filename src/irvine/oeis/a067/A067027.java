package irvine.oeis.a067;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002110;

/**
 * A067027 Numbers n such that (prime(n)# + 4)/2 is a prime, where x# is the primorial A034386(x).
 * @author Sean A. Irvine
 */
public class A067027 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A067027() {
    super(1, 1, new A002110().skip(), k -> k.divide2().add(2).isProbablePrime());
  }
}
