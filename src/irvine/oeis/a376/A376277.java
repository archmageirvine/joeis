package irvine.oeis.a376;
// Generated by gen_seq4.pl 2025-07-15.ack/holos at 2025-07-15 23:51

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A376277 The least increasing sequence starting with 1, such that the determinants of the Hankel matrices H1 = [a(0), a(1), ..., a(n); ...; a(n), a(n+1), ..., a(2*n)] and H2 = [a(1), a(2), ..., a(n+1); ...; a(n+1), a(n+2), ..., a(2*n+1)] are &gt; 0.
 * (1-(-1+x)*(1-4*x)^(1/2)-5*x+2*x^2)/(1-7*x+11*x^2+(1-4*x)^(1/2)*(x^2-3*x+1))
 * @author Georg Fischer
 */
public class A376277 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A376277() {
    super(0, "[[0],[2448,-594,36],[44208,-9909,543],[-401264,115350,-8230],[671844,-222909,18315],[-499968,192555,-18225],[198072,-90726,10038],[-43292,24693,-3277],[4908,-3819,633],[-224,303,-67],[0,-9,3]]", "1,2,5,13", 0, 0);
  }
}
