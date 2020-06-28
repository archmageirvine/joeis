package irvine.oeis.a032;

/**
 * A032857 Numbers n such that base 10 representation <code>sum(d(i)*10^i; i=0,1,...,m), d(m)&gt;0</code>, has <code>d(m)&lt;=d(m-1)&gt;=d(m-2)&lt;=..</code>.
 * @author Sean A. Irvine
 */
public class A032857 extends A032849 {

  @Override
  protected long base() {
    return 10;
  }
}
