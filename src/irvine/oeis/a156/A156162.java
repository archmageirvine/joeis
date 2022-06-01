package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156162 a(n) = 34*a(n-1)-a(n-2)-2312 for n &gt; 2; a(1)=625, a(2)=18769.
 * @author Sean A. Irvine
 */
public class A156162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156162() {
    super(new long[] {1, -35, 35}, new long[] {625, 18769, 635209});
  }
}
