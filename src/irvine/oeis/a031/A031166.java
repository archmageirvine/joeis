package irvine.oeis.a031;

/**
 * A031166 <code>a(n) = prime(n+4) - prime(n)</code>.
 * @author Sean A. Irvine
 */
public class A031166 extends A031169 {

  @Override
  protected int shift() {
    return 4;
  }
}
