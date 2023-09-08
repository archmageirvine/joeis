package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a007.A007376;

/**
 * A065648 a(0) = 1 and for n &gt; 0: a(n) = number of indices 0 &lt;= i &lt;= n with A033307(i)=A033307(n), where A033307 is the sequence of decimal digits of Champernowne's constant 0.123456789101112131415...
 * @author Sean A. Irvine
 */
public class A065648 extends A007376 {

  private final long[] mCounts = new long[10];

  @Override
  public Z next() {
    return Z.valueOf(++mCounts[super.next().intValue()]);
  }
}
