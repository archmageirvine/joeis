package irvine.oeis.a152;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A152122 a(n) = Product_{k=1..(n-1)/2} 1 + 4*cos(k*Pi/n)^2 + 16*cos(k*Pi/n)^4 + 64*cos(k*Pi/n)^6 + 256*cos(k*Pi/n)^8.
 * @author Georg Fischer
 */
public class A152122 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A152122() {
    super(0, "[1,0,-15,-36,31,130,-81,-184,265,-26,-149,60,59,-14,-15,-2,1]", "[1,-1,-15,-25,45,95,-115,-105,265,-105,-115,95,45,-25,-15,-1,1]");
  }
}
