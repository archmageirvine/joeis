package irvine.oeis.a098;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A098664 E.g.f. BesselI(0,4x)+BesselI(1,4x)/2.
 * Recurrence: -(3*n+1)*(n+1)*a(n)+8*a(n-1)+16*(3*n+4)*(n-1)*a(n-2) = 0.
 * @author Georg Fischer
 */
public class A098664 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A098664() {
    super(0, "[[0],[-64,16,48],[8],[-1,-4,-3]]", "1", 0);
  }
}
