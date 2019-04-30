package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156162 <code>a(n) = 34*a(n-1)-a(n-2)-2312</code> for <code>n &gt; 2; a(1)=625, a(2)=18769</code>.
 * @author Sean A. Irvine
 */
public class A156162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156162() {
    super(new long[] {1, -35, 35}, new long[] {625, 18769, 635209});
  }
}
