package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156574 a(n) = 34*a(n-1) - a(n-2) - 4232 for n &gt; 2; a(1)=1369, a(2)=42025.
 * @author Sean A. Irvine
 */
public class A156574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156574() {
    super(new long[] {1, -35, 35}, new long[] {1369, 42025, 1423249});
  }
}
