package irvine.oeis.a037;

/**
 * A037865 a(n)=(number of digits &lt;=2)-(number of digits &gt;2) in base 6 representation of n.
 * @author Sean A. Irvine
 */
public class A037865 extends A037861 {

  {
    super.next(); // skip 0
  }

  @Override
  protected long base() {
    return 6;
  }
}
