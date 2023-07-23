package irvine.oeis.a052;

import irvine.oeis.InverseSequence;

/**
 * A052345 Least k such that A052343(k)=n.
 * @author Sean A. Irvine
 */
public class A052345 extends InverseSequence {

  /** Construct the sequence. */
  public A052345() {
    super(0, new A052343().skip(1), 0, 1);
  }
}
