package irvine.oeis.a037;

/**
 * A037868 a(n)=(number of digits &lt;=4)-(number of digits &gt;4) in base 9 representation of n.
 * @author Sean A. Irvine
 */
public class A037868 extends A037861 {

  {
    super.next(); // skip 0
  }

  @Override
  protected long base() {
    return 9;
  }
}
