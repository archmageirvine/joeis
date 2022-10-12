package irvine.oeis.a166;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A166300 Number of Dyck paths of semilength n, having no ascents and no descents of length 1, and having no UUDD's starting at level 0.
 * (n+1)*a(n) +2*(-n+1)*a(n-1) +(-n+1)*a(n-2) +2*(-n+1)*a(n-3) +(n-3)*a(n-4)=0
 * @author Georg Fischer
 */
public class A166300 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A166300() {
    super(0, "[[0],[-3,1],[2,-2],[1,-1],[2,-2],[1,1]", "1,0,0,1", 0);
  }
}
