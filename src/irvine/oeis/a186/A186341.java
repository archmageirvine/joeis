package irvine.oeis.a186;
// Generated by gen_seq4.pl holos at 2021-06-07 19:33
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A186341 a(n)=sum{k=0..floor(n/2), binomial(n-k,k)*A186338(k)}.
 * radtorec(1/2*(1-x-3*x^2-((-16*x^6-25*x^5+15*x^4+19*x^3-7*x^2-3*x+1)/(1-x))^(1/2))/x^2/(-2*x^2-x+1))
 * @author Georg Fischer
 */
public class A186341 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A186341() {
    super(0, "[[0],[77952,-10944, 384],[10704,-1128, 24],[-366568, 59844,-2444],[-59572, 11278,-534],[582266,-110507, 5247],[72836,-18920, 1188],[-430176, 99349,-5731],[-24598, 10701,-989],[164868,-50282, 3818],[-2884,-861, 253],[-31932, 14611,-1645],[2628,-1344, 156],[2438,-2025, 403],[-252, 367,-115],[0, 54,-30],[-14, 3, 17],[0,-4,-2]]", "1, 1, 3, 5, 15, 33, 95, 237, 667, 1765, 4943, 13505, 37967, 105837, 299675, 847253, 2417903, 6909409, 19866303, 57253165, 165728475, 480938693", 0);
  }
}
