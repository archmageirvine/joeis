package irvine.oeis.a072;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A072853 Number of permutations satisfying i-2&lt;=p(i)&lt;=i+6, i=1..n.
 * @author Georg Fischer
 */
public class A072853 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A072853() {
    super(1, "[[0],[-1],[-1],[0],[0],[2],[2],[0],[0],[10],[11],[5],[0],[-20],[-20],[-8],[0],[-28],[-28],[-19],[-11],[56],[44],[26],[14],[8],[4],[2],[1],[-1]]",
      "1, 2, 6, 18, 54, 162, 486, 1394, 3991, 11593, 33772, 98320, 286072, 831952, 2418664, 7030816, 20441944, 59441521, 172843609, 502580846, 1461344622, 4249102850, 12354982862, 35924300898, 104456501102, 303726483778, 883140022543, 2567889393217", 0);
  }
}
