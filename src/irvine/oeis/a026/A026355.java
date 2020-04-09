package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026355 <code>a(n) =</code> least k such that <code>s(k) = n+1</code>, where s <code>= A026354</code>.
 * @author Sean A. Irvine
 */
public class A026355 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026355() {
    super(new A026354());
  }
}
