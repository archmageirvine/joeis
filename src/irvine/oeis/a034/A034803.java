package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034803 Consider the sequence of <code>4-tuples {0,a,b,c} (c&gt;=a+b; a,b,c&gt;0))</code> which have the smallest integer 'c' required to reach <code>{k,k,k,k}</code> in n steps under map <code>{r,s,t,u}-&gt;{|r-s|,|s-t|,|t-u|,|u-r|}</code>. This sequence gives the second term 'a' of these quadruples.
 * @author Sean A. Irvine
 */
public class A034803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034803() {
    super(new long[] {1, 0, 0, 1, 0, 0, 3, 0, 0}, new long[] {1, 0, 0, 1, 0, 1, 1, 2, 2});
  }
}
