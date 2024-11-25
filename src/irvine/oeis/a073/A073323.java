package irvine.oeis.a073;

import irvine.oeis.InverseSequence;
import irvine.oeis.PrependSequence;

/**
 * A073323 Smallest k such that A073259(k)=n or 0 if there is no such value; the first number of which length of fixed-point-list terminated by k-th composite number equals n.
 * @author Sean A. Irvine
 */
public class A073323 extends PrependSequence {

  /** Construct the sequence. */
  public A073323() {
    super(1, new InverseSequence(new A073259(), 3), 0, 0);
  }
}

