package irvine.oeis.a003;

/**
 * A003045 a(n) (n&gt;6) is least integer &gt; a(n-1) with precisely three representations a(n) = a(i) + a(j), 1 &lt;= i &lt; j &lt; n, a(n) = n for n=1..6.
 * @author Sean A. Irvine
 */
public class A003045 extends A003044 {

  @Override
  protected int numReps() {
    return 3;
  }
}
