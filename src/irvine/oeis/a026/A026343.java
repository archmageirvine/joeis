package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026343 Least k such that <code>s(k) =</code> n, where s <code>= A026342</code>.
 * @author Sean A. Irvine
 */
public class A026343 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026343() {
    super(new A026342());
  }
}
