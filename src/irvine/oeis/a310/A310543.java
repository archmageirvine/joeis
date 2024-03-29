package irvine.oeis.a310;
// Generated by gen_seq4.pl tile1 at 2020-05-30 23:34
// DO NOT EDIT here!

import org.teherba.tile.TilingSequence;

/**
 * A310543 Coordination sequence Gal.3.44.1 where Gal.u.t.v denotes the coordination sequence for a vertex of type v in tiling number t in the Galebach list of u-uniform tilings.
 * @author Georg Fischer
 */
public class A310543 extends TilingSequence {

  /** Construct the sequence. */
  public A310543() {
    super(0, new String[]
        { "6.3.6.3;B60+2,B60-2,B240+2,B240-2"
        , "6.3.3.3.3;B180-1,A300+1,B180-3,C180+5,C0+3"
        , "3.3.3.3.3.3;C180+1,B180-5,B0+5,C180+4,B180+4,B0-4"
        });
    defineBaseSet(0);
  }
}
