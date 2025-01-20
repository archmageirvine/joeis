package irvine.oeis.a074;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a011.A011757;

/**
 * A074328 Numbers m such that prime(m^2+1)-prime(m^2)=2, where prime(j) is the j-th prime.
 * @author Sean A. Irvine
 */
public class A074328 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074328() {
    super(1, 1, new A011757(), n -> n.add(2).isProbablePrime());
  }
}
