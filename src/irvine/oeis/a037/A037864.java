package irvine.oeis.a037;

/**
 * A037864 a(n)=(number of digits &lt;=2)-(number of digits &gt;2) in base 5 representation of n.
 * @author Sean A. Irvine
 */
public class A037864 extends A037861 {

  {
    super.next(); // skip 0
  }

  @Override
  protected long base() {
    return 5;
  }
}
