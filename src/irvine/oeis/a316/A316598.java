package irvine.oeis.a316;
// Generated by gen_seq4.pl 2025-03-06.ack/holos at 2025-03-06 22:47

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A316598 a(n) is the number of rooted quadrangulations of the projective plane with n vertices.
 * (1-x-3*x*(1-sqrt(1-12*x))/(6*x) - sqrt(1-4*x-4*x*(1-sqrt(1-12*x))/(6*x)))/x, where c=(1-sqrt(1-12*x))/(6*x)
 * @author Georg Fischer
 */
public class A316598 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A316598() {
    super(1, "[[0],[246343680,-189858816, 54660096,-6967296, 331776],[-933120, 4593024,-2747520, 580608,-41472],[-4587840, 4201200,-1357344, 176256,-6912],[365040,-480600, 227568,-45792, 3264],[-8640, 18960,-14376, 4584,-528],[0,-152, 304,-190, 38],[0,-2, 1, 2,-1]]", "5, 38", 0, 0);
  }
}
