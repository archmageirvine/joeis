package irvine.oeis.a032;

/**
 * A032898 Numbers n whose base 10 representation <code>sum(d(i)*10^i; i=0,1,...,m), d(m)&gt;0</code>, has <code>d(0)&gt;=d(1)&lt;=d(2)&gt;=..</code>.
 * @author Sean A. Irvine
 */
public class A032898 extends A032890 {

  @Override
  protected int base() {
    return 10;
  }
}
