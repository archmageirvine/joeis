package irvine.oeis.a026;

import irvine.oeis.InverseSequence;

/**
 * A026343 Least k such that s(k) = n, where s = A026342.
 * @author Sean A. Irvine
 */
public class A026343 extends InverseSequence {

  /** Construct the sequence. */
  public A026343() {
    super(new A026342());
  }
}
