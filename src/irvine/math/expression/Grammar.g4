/**
 * Grammar. Build with:
 * <pre>
 * antlr4 -o /home/sean/joeis/src/irvine/math/expression -package irvine.math.expression -Dlanguage=Java -no-listener -no-visitor -lib /home/sean/joeis/src/irvine/math/expression /home/sean/joeis/src/irvine/math/expression/Grammar.g4
 * </pre>
 * @author Sean A. Irvine
 */

grammar Grammar;
@parser::header{
package irvine.math.expression;

import irvine.math.z.Z;

/**
 * Parser.
 * @author Sean A. Irvine
 */
}

@lexer::header{
package irvine.math.expression;

import irvine.math.z.Z;

/**
 * Lexer.
 * @author Sean A. Irvine
 */
}

/*
 * Main expression parser. Items listed here in a particular order so that
 * correct precedence rules are applied.
 */

expr returns [Expression v]

  : 'log' '(' a=expr ')'
    {
      $ctx.v = new Logarithm($a.v);
    }

  | 'diff' '(' a=expr ',' IDENTIFIER ')'
    {
      $ctx.v = new Derivative($a.v, new Identifier($IDENTIFIER.text));
    }

  | 'exp' '(' a=expr ')'
    {
      $ctx.v = new Exponential($a.v);
    }

  | 'cosh' '(' a=expr ')'
    {
      $ctx.v = new HyperbolicCosine($a.v);
    }

  | 'sinh' '(' a=expr ')'
    {
      $ctx.v = new HyperbolicSine($a.v);
    }

  | 'tanh' '(' a=expr ')'
    {
      $ctx.v = new HyperbolicTangent($a.v);
    }

  | 'lucas' '(' a=expr ')'
    {
      $ctx.v = new Lucas($a.v);
    }

  | 'fibonacci' '(' a=expr ')'
    {
      $ctx.v = new Fibonacci($a.v);
    }

  | 'subs' '(' a=expr ',' IDENTIFIER '=' b=expr ')'
    {
      $ctx.v = new Substitution($a.v, new Identifier($IDENTIFIER.text), $b.v);
    }

  | 'sum' '(' a=expr ',' IDENTIFIER '=' b=expr '..' c=expr ')'
    {
      $ctx.v = new Sum($a.v, new Identifier($IDENTIFIER.text), $b.v, $c.v);
    }

  | '(' a=expr ')'
    {
      $ctx.v = $a.v;
    }

  | a=expr '!'
    {
      $ctx.v = new Factorial($a.v);
    }

  | a=expr '##'
    {
      $ctx.v = new Primorial($a.v, true);
    }

  | a=expr '#'
    {
      $ctx.v = new Primorial($a.v);
    }

  | <assoc=right> a=expr '^' b=expr
    {
     $ctx.v = new Power($a.v, $b.v);
    }

  | '+' a=expr
    {
      $ctx.v = $a.v;
    }

  | '-' a=expr
    {
      $ctx.v = new Negate($a.v);
    }

  | a=expr op=('*'|'/'|'%') b=expr
    {
      if ("*".equals($op.text)) {
        $ctx.v = Multiply.create($a.v, $b.v);
      } else if ("/".equals($op.text)) {
        $ctx.v = Divide.create($a.v, $b.v);
      } else {
      $ctx.v = new Modulo($a.v, $b.v);
      }
    }

  | a=expr '-' b=expr
    {
      $ctx.v = Subtract.create($a.v, $b.v);
    }

  | a=expr '+' b=expr
    {
      $ctx.v = Add.create($a.v, $b.v);
    }

  | INTEGER
    {
      $ctx.v = new LiteralZ(new Z($INTEGER.text));
    }

  | IDENTIFIER
    {
      $ctx.v = new Identifier($IDENTIFIER.text);
    }
  ;


/** Lexical elements. */
INTEGER         :	[0-9]+ ;
WS              : [ \r\t\n] -> skip ;
IDENTIFIER      : [a-z]+ ;
