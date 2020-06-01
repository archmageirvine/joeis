package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045794 Consider all quadruples <code>{a,b,c,d}</code> which reach <code>{k,k,k,k}</code> in n steps under map <code>{a,b,c,d}-&gt;{|a-b|,|b-c|,|c-d|,|d-a|};</code> look at <code>max{a,b,c,d};</code> sequence gives minimal value of this.
 * @author Sean A. Irvine
 */
public class A045794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045794() {
    super(new long[] {1, 0, 0, 1, 0, 0, 3, 0, 0}, new long[] {1, 1, 1, 3, 3, 4, 9, 11, 13});
  }
}
