package irvine.oeis.a174;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A174227 Expansion of -(10*x + sqrt((1-10*x)*(1-14*x)))/(2*x).
 * @author Georg Fischer
 */
public class A174227 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A174227() {
    // (n+1)*a(n) +12*(1-2*n)*a(n-1) +140*(n-2)*a(n-2)=0
    super(0, "[[0],[-280,140],[12,-24],[1,1]]", "1,1", 0);
  }
}
