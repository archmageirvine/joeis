package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156160 a(n) = 34*a(n-1)-a(n-2)-2312 for n &gt; 2; a(1)=169, a(2)=2809.
 * @author Sean A. Irvine
 */
public class A156160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156160() {
    super(1, new long[] {1, -35, 35}, new long[] {169, 2809, 93025});
  }
}
