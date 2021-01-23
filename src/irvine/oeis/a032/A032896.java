package irvine.oeis.a032;

/**
 * A032896 Numbers n such that base 8 representation Sum{d(i)*8^i: i=0,1,...,m has d(0)&gt;=d(1)&lt;=d(2)&gt;=...
 * @author Sean A. Irvine
 */
public class A032896 extends A032890 {

  @Override
  protected int base() {
    return 8;
  }
}
