package irvine.oeis.a306;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A306642 a(n) = Sum_{k=0..n} (3*n)!/(k! * (n-k)!)^3.
 * @author Georg Fischer
 */
public class A306642 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A306642() {
    super(0, "[[0],[-2880,16848,-31752,23328,-5832],[-12,96,-285,378,-189],[0,0,0,0,1]]", "1", 0);
  }
}
