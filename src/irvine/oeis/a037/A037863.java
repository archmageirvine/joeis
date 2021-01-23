package irvine.oeis.a037;

/**
 * A037863 a(n)=(number of digits &lt;=1)-(number of digits &gt;1) in base 4 representation of n.
 * @author Sean A. Irvine
 */
public class A037863 extends A037861 {

  {
    super.next(); // skip 0
  }

  @Override
  protected long base() {
    return 4;
  }
}
