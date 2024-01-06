package irvine.oeis.a034;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A034804 Consider the sequence of 4-tuples {0,a,b,c} (c&gt;=a+b; a,b,c&gt;0) which have the smallest integer 'c' required to reach {k,k,k,k} in n steps under map {r,s,t,u}-&gt;{|r-s|,|s-t|,|t-u|,|u-r|}. This sequence gives the third term 'b' of these quadruples.
 * @author Sean A. Irvine
 */
public class A034804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034804() {
    super(1, new long[] {1, 0, 0, 1, 0, 0, 3, 0, 0}, new long[] {0, 1, 0, 2, 1, 2, 4, 5, 6});
  }
}
