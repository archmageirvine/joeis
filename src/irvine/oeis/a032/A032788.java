package irvine.oeis.a032;

/**
 * A032788 Numbers k such that k(k+1)(k+2)...(k+19) / (k+(k+1)+(k+2)+...+(k+19)) is an integer.
 * @author Sean A. Irvine
 */
public class A032788 extends A032785 {

  @Override
  protected long t() {
    return 19;
  }
}

