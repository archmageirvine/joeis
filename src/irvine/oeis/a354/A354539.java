package irvine.oeis.a354;
// manually 2022-08-22

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A354539 Number of decorated Dyck paths of length n without peaks at level 1 ending at arbitrary levels.
 * Recurrence: 12*(n+1)*a(n) +3*(-5*n-11)*a(n-1) +5*(-19*n+29)*a(n-2) +14*(5*n-4)*a(n-3) +2*(93*n-356)*a(n-4) +2*(20*n-81)*a(n-5) +2*(-22*n+217)*a(n-6) +2*(-35*n+268)*a(n-7) +2*(-27*n+182)*a(n-8) +5*(-5*n+39)*a(n-9) +5*(-n+9)*a(n-10)=0.
 * @author Georg Fischer
 */
public class A354539 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A354539() {
    super(0, "[[0],[45,-5],[195,-25],[364,-54],[536,-70],[434,-44],[-162, 40],[-712, 186],[-56, 70],[145,-95],[-33,-15],[12, 12]]", "1, 1, 1, 2, 5, 8, 18, 31, 71, 126, 290", 0);
  }
}
