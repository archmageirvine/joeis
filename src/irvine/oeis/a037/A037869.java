package irvine.oeis.a037;

/**
 * A037869 a(n)=(number of digits &lt;=4)-(number of digits &gt;4) in base 10 representation of n.
 * @author Sean A. Irvine
 */
public class A037869 extends A037861 {

  {
    super.next(); // skip 0
  }

  @Override
  protected long base() {
    return 10;
  }
}
